package tk.fridtjof.webserver;

import tk.fridtjof.puddingapi.general.utils.Logger;

public class Main {

    static Logger logger = new Logger("Main", true, false);

    public static void main(String[] args) {

        int port = 80;

        for (String arg: args) {

            if (arg.startsWith("--port=")) {
                arg = arg.replace("--port=", "");
                logger.debug(arg);
                port = Integer.parseInt(arg);
            }
        }

        logger.info("Starting server...");
        new HTTPServer(port);
    }
}
