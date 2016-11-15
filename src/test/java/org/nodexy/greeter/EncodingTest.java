package org.nodexy.greeter;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;

import static org.nodexy.greeter.util.Utils.put;


/**
 * Created by phoenix on 11/1/16.
 */
public class EncodingTest {
    @Test
    public void test() {

        String str = "But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure? On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee.";
        byte[] encoding = Base64.getEncoder().encode(str.getBytes());

        put("unencoded:\t",str);
        put("encoded:\t", new String(encoding));
    }
    @Test
    public void testDate() {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME).replace("-","").replace("T","-").replace(":","");
        put(timestamp.substring(0,timestamp.indexOf('.')));
        put(new Date().toString());
    }
}
