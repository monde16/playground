package org.nodexy.greeter;

import org.junit.Test;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;
import java.util.Date;

import static org.nodexy.greeter.util.Utils.put;
import org.apache.commons.io.IOUtils;

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
    @Test public void testDecode() throws IOException {
        String str = "\n" +
                "PHA+V2VsY29tZSB0cm9waGVwdWR1QGhvdXNhdC5jb20hPC9wPg0KDQo8cD5Zb3UgY2FuIGNvbmZp\n" +
                "cm0geW91ciBhY2NvdW50IHRocm91Z2ggdGhlIGxpbmsgYmVsb3c6PC9wPg0KDQo8cD48YSBocmVm\n" +
                "PSJodHRwczovL3d3dy5icm93c2Vyc3RhY2suY29tL3VzZXJzL2NvbmZpcm1hdGlvbj9jb25maXJt\n" +
                "YXRpb25fdG9rZW49MjRkZjA5NDZhZjdjODM2OGJiNGNkYzJkNDRjZTdjNzU5NDgxOTdmZiI+Q29u\n" +
                "ZmlybSBteSBhY2NvdW50PC9hPjwvcD48aW1nIHdpZHRoPSIxcHgiIGhlaWdodD0iMXB4IiBhbHQ9\n" +
                "IiIgc3JjPSJodHRwOi8vZW1haWwuYnJvd3NlcnN0YWNrLmNvbS9vL2VKd056REVPd3lBTUFNRFhs\n" +
                "REhDeEdBNjhCWmtjQkJJaVVDUTlQM05lTXRKc01rS3FSYXNKMC1pRXdHQVJDaHVwOHlRa0FqWmYx\n" +
                "Q25GU2UzY19FWThXeV9JNXJ0ZXExcS1ITFJyTWtLN21LYzlSa3pGTlNZeEFnNjhtcUdlX1pSal9I\n" +
                "STgwNjFQNHZ2TGZmckR6eVdKdnMiPg==";
        byte[] bytes = Base64.getDecoder().decode(str.replace("\n", ""));
        System.out.println(bytes);
        IOUtils.write(bytes,System.out);
    }
    @Test
    public void testDate2() throws ParseException {
        String ds = "2017/02/28";
        new SimpleDateFormat("yyyy/MM/dd").parse(ds);
        int[] parts = new int[3];
        String[] parts_str = ds.split("/");
        for (int i = 0; i < 3; i++) {
            parts[i] = Integer.parseInt(parts_str[i]);
        }
        System.out.println("date, "+ds+", is"+(isValidDate(parts[0],parts[1],parts[2])?"":" not")+" valid");
    }
    private static boolean isValidDate(int year, int month, int day) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
