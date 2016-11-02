import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author <a href="mailto:jhonatan.zambrano@payulatam.com">Jhonatan A. Zambrano</a>
 *         1/11/2016
 */
public class PayUIntellij {

    public static void main(String[] args) {

        String base = "D:\\jhonatan.zambrano\\PayU\\git\\pagosonlinepps\\";
        String[] spaces = {
                "ppp-core-spaces\\ppp-core-account-space\\ppp-core-account-space.iml",
                "ppp-core-spaces\\ppp-core-data-space\\ppp-core-data-space.iml",
                "ppp-core-spaces\\ppp-core-payment-workflow-space\\ppp-core-payment-workflow-space.iml",
                "ppp-core-spaces\\ppp-core-bridge-space\\ppp-core-bridge-space.iml",
                "ppp-core-utils-pu\\ppp-core-utils-pu.iml",
                "ppp-core-account\\ppp-core-account.iml",
                "ppp-pps-pu\\ppp-pps-pu.iml",
                "ppp-pps-ppn-local\\ppp-pps-ppn-local.iml",
        };

        for (String space : spaces) {
            replace(base + space);
        }
    }

    public static void replace(String uri) {
        Path path = Paths.get(uri);
        Charset charset = StandardCharsets.UTF_8;

        try {
            String content = new String(Files.readAllBytes(path), charset);
            content = content.replaceAll("scope=\"PROVIDED\" ", "");
            Files.write(path, content.getBytes(charset));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
