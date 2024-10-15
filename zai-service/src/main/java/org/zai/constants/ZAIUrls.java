package org.zai.constants;

public interface ZAIUrls {
    public static String tokenUri= "https://au-0000.sandbox.auth.assemblypay.com/tokens";
    public static String createClient= "https://test.api.promisepay.com/users";

    //Agreement URLS
    public static String commonAgreementUrl="https://sandbox.au-0000.api.assemblypay.com/payto";
    public static String validatePayToAgreement="/agreements/validate";
    public static String createPayToAgreement= "/agreements/{agreement_uuid}/create";
    public static String getPayToAgreementDetails="/agreements/{agreement_uuid}";
    public static String payToAgreementStatus="/agreements/{agreement_uuid}/payment_requests/initiate";
    public static String getPayToPaymentInitiationRequestDetails="/payment_requests/{payment_request_uuid}";

    public static String amendPayToAgreementDetails="https://virtserver.swaggerhub.com/AssemblyPlatforms/PayTo/1.1-external/agreements/{agreement_uuid}";
        public static String initiatePayToPayment="https://virtserver.swaggerhub.com/AssemblyPlatforms/PayTo/1.1-external/agreements/{agreement_uuid}/payment_requests/initiate";


}
