package pstd.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;

public class Main {

    public static void main(String[] args) {

        WireMockServer wireMockServer = new WireMockServer(WireMockConfiguration.options().port(8089));

        if (args.length != 1) {
            System.out.println("Try either & only 'start' or 'stop' command");
        } else if (args[0].equals("start")) {
            wireMockServer.start();
        } else if (args[0].equals("stop")) {
            wireMockServer.stop();
        } else {
            System.out.println("Try either & only 'start' or 'stop' command");
        }
    }

}
