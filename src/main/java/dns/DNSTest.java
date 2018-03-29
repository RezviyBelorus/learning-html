package dns;

import sun.net.spi.nameservice.dns.DNSNameService;

import java.net.InetAddress;

public class DNSTest {
    public static void main(String[] args) throws Exception {
        DNSNameService dns = new DNSNameService();
        InetAddress[] inetAddresses = dns.lookupAllHostAddr("google.com");
        for (InetAddress address : inetAddresses) {
            System.out.println(address);
        }

        System.out.println("****");

        for (InetAddress address : inetAddresses) {
            System.out.println(address);
            System.out.println(dns.getHostByAddr(address.getAddress()));
        }
    }
}
