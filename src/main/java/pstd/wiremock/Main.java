package pstd.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.options;


public class Main {

    public static void main(String[] args) {

        WireMockServer wireMockServer = new WireMockServer(options().port(8089));

        if (args.length != 1)
            System.out.println("Try either & only 'start' or 'stop' command");

        else if (args[0].equals("start")) {
            wireMockServer.start();
        }

        else if (args[0].equals("stop")){
            wireMockServer.stop();
        }

        else
            System.out.println("Try either & only 'start' or 'stop' command");
    }

}
