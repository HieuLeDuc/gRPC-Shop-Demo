package de.home.grpc.vs.grpc_student_service_demo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.UnknownHostException;

import de.home.grpc.vs.grpc_student_service_demo.model.DataSource;
import de.home.grpc.vs.service.StoreService;
import io.grpc.Server;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;

/**
 * Hello world!
 *
 */
public class ServiceApp 
{
    public static void main( String[] args )
    {
        System.out.println( "Starting gRPC Storefront!" );
        InetAddress addr = null;
		try {
			addr = InetAddress.getByName("localhost");
		} catch (UnknownHostException e) {
			System.err.println("Error: Unknown Host!");
			System.exit(1);
		}
        int port = 8080;
        SocketAddress sockaddr = new InetSocketAddress(addr, port);
        Server server = NettyServerBuilder.forAddress(sockaddr).addService(new StoreService()).build(); // create a instance of server	
        
        DataSource.getInstance().prefillData();
		try {
			server.start();
		} catch (IOException e) {
			System.out.println("Connection closed.");
		}
		System.out.println("Server started at "+ server.getPort());
		try {
			server.awaitTermination();
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
		}
    }
}
