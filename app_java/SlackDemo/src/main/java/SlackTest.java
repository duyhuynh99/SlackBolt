import com.github.seratch.jslack.Slack;
import com.github.seratch.jslack.api.webhook.Payload;
import com.github.seratch.jslack.api.webhook.WebhookResponse;
public class SlackTest {

    private static String webHooksUrl ="https://hooks.slack.com/services/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";
    private static String oAuthToken ="xoxb-2756939180054-2768402723701-JI3EiDZmwMcHZE5aSk7iTAR0";
    private static String slackChannel="slackdemochannel";

    public void main(String[] args){
        sendMessagetoSlack("xin chao");
    }

    public static void  sendMessagetoSlack(String message){
        try{
        StringBuilder msgbuilder= new StringBuilder();
        msgbuilder.append(message);

        Payload payload =Payload.builder().channel(slackChannel).text(msgbuilder.toString()).build();

        WebhookResponse wbResp= Slack.getInstance().send(webHooksUrl,payload);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
