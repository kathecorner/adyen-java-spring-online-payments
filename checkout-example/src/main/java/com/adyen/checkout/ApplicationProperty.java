package com.adyen.checkout;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class ApplicationProperty {

    @Value("${server.port}")
    private int serverPort;

    //@Value("${ADYEN_API_KEY:#{AQEyhmfxL4PJahZCw0m/n3Q5qf3VaY9UCJ1+XWZe9W27jmlZiv4PD4jhfNMofnLr2K5i8/0QwV1bDb7kfNy1WIxIIkxgBw==-lUKXT9IQ5GZ6d6RH4nnuOG4Bu//eJZxvoAOknIIddv4=-<anpTLkW{]ZgGy,7}}")
    //@Value("${ADYEN_API_KEY:AQEyhmfxL4PJahZCw0m/n3Q5qf3VaY9UCJ1+XWZe9W27jmlZiv4PD4jhfNMofnLr2K5i8/0QwV1bDb7kfNy1WIxIIkxgBw==-lUKXT9IQ5GZ6d6RH4nnuOG4Bu//eJZxvoAOknIIddv4=-<anpTLkW{]ZgGy,7")
    @Value("${ADYEN_API_KEY:#{null}}")
    private String apiKey;

    //@Value("${ADYEN_MERCHANT_ACCOUNT:#{KenjiW}}")
    //@Value("${ADYEN_MERCHANT_ACCOUNT:KenjiW}")
    @Value("${ADYEN_MERCHANT_ACCOUNT:#{null}}")
    private String merchantAccount;

    //@Value("${ADYEN_CLIENT_KEY:#{test_RKKBP5GHOFFUFJJMJHOJAG7ZIIJKBMI6}}")
    @Value("${ADYEN_CLIENT_KEY:#{null}}")
    private String clientKey;

    //@Value("${ADYEN_HMAC_KEY:ee40ca7bc90df844d2f5b5667b27361a2350fad99352d8a6ce061c69e41e5d32}")
    @Value("${ADYEN_HMAC_KEY:#{null}}")
    private String hmacKey;

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getMerchantAccount() {
        return merchantAccount;
    }

    public void setMerchantAccount(String merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public String getHmacKey() {
        return hmacKey;
    }

    public void setHmacKey(String hmacKey) {
        this.hmacKey = hmacKey;
    }
}
