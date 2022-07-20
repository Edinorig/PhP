import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    static String text = "fnvjke nfv erjvhje venjfvhjd fvj erv nf vnddnmf vndfv";

    static String messanger = "Telegram";
    static String recipient = "Denchik";
    private static BufferedWriter bw = null;


    public static void main(String[] args) throws IOException {

        File f = new File("index.html");
      bw = new BufferedWriter(new FileWriter(f));
        bw.write("<html><head><style>" +
                "body{background: gray;}" +
                "#main_block{width: 428px;height: 756px;background: white;margin-left: 500px; margin-top: 10px; border-radius: 10px;}" +
                ".main_block_inf_pos{ display: flex; justify-content: space-around;}" +
                ".main_block_inf{width:200px; height:45px; background: black; margin-top: 10px; border-radius:10px; color: white; display: flex; justify-content: center; align-items: center;}" +
                ".message{margin:10px; word-wrap: break-word;border-radius: 3px;padding: 5px;}" +
                "#main_block_chat{width:428px; height:680px;background: black; border-radius: 10px; margin-top: 21px; overflow: auto;}" +
                ".recipient{background:white;float:right;}" +
                ".sender{background:gray;float:left;}" +
                ".main_block_message{width:428px;}" +
                "</style></head><body>");

        bw.write("<div id=\"main_block\">");
            bw.write("<div class=\"main_block_inf_pos\"> ");
                setMessanger(messanger);

                setContact(recipient);

            bw.write("</div>");
            bw.write("<div id=\"main_block_chat\">");

                bw.write("<div class=\"main_block_message\">");
                    createMessageRecipient(text);
                bw.write("</div>");
                bw.write("<div class=\"main_block_message\">");
                    createMessageSender(text);
                 bw.write("</div>");

                bw.write("<div class=\"main_block_message\">");
                createMessageRecipient(text);
                bw.write("</div>");
                bw.write("<div class=\"main_block_message\">");
                    createMessageSender(text);
                bw.write("</div>");

            bw.write("</div>");

        bw.write("</div>");
            bw.write("</div>");
        bw.write("</div>");
        bw.write("</body></html>");
        bw.close();

        Desktop.getDesktop().browse(f.toURI());
    }


    public static void createMessageRecipient(String text) throws IOException
    {
        bw.write("<div class=\"message recipient\">");
        bw.write("<p>"+text+"</p>");
        bw.write("</div>");
    }

    public static void createMessageSender(String text) throws IOException
    {
        bw.write("<div class=\"message sender\">");
        bw.write("<p>"+text+"</p>");
        bw.write("</div>");
    }

    public static void setMessanger(String messanger) throws IOException {
        bw.write("<div class=\"main_block_inf\">");
        bw.write("<p>"+messanger+"</p>");
        bw.write("</div>");
    }

    public static void setContact(String contact) throws IOException {
        bw.write("<div class=\"main_block_inf\">");
        bw.write("<p>"+contact+"</p>");
        bw.write("</div>");
    }
}
