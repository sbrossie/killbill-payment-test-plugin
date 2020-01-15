/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.paymenttest.dao.gen;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.paymenttest.dao.gen.tables.TestpaymentHppRequests;
import org.killbill.billing.plugin.paymenttest.dao.gen.tables.TestpaymentPaymentMethods;
import org.killbill.billing.plugin.paymenttest.dao.gen.tables.TestpaymentResponses;
import org.killbill.billing.plugin.paymenttest.dao.gen.tables.records.TestpaymentHppRequestsRecord;
import org.killbill.billing.plugin.paymenttest.dao.gen.tables.records.TestpaymentPaymentMethodsRecord;
import org.killbill.billing.plugin.paymenttest.dao.gen.tables.records.TestpaymentResponsesRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>killbill</code> 
 * schema
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<TestpaymentHppRequestsRecord, ULong>    IDENTITY_TESTPAYMENT_HPP_REQUESTS    = Identities0.IDENTITY_TESTPAYMENT_HPP_REQUESTS;
    public static final Identity<TestpaymentPaymentMethodsRecord, ULong> IDENTITY_TESTPAYMENT_PAYMENT_METHODS = Identities0.IDENTITY_TESTPAYMENT_PAYMENT_METHODS;
    public static final Identity<TestpaymentResponsesRecord, ULong>      IDENTITY_TESTPAYMENT_RESPONSES       = Identities0.IDENTITY_TESTPAYMENT_RESPONSES;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TestpaymentHppRequestsRecord>    KEY_TESTPAYMENT_HPP_REQUESTS_PRIMARY                                      = UniqueKeys0.KEY_TESTPAYMENT_HPP_REQUESTS_PRIMARY;
    public static final UniqueKey<TestpaymentHppRequestsRecord>    KEY_TESTPAYMENT_HPP_REQUESTS_RECORD_ID                                    = UniqueKeys0.KEY_TESTPAYMENT_HPP_REQUESTS_RECORD_ID;
    public static final UniqueKey<TestpaymentHppRequestsRecord>    KEY_TESTPAYMENT_HPP_REQUESTS_TESTPAYMENT_HPP_REQUESTS_KB_SESSION_ID       = UniqueKeys0.KEY_TESTPAYMENT_HPP_REQUESTS_TESTPAYMENT_HPP_REQUESTS_KB_SESSION_ID;
    public static final UniqueKey<TestpaymentPaymentMethodsRecord> KEY_TESTPAYMENT_PAYMENT_METHODS_PRIMARY                                   = UniqueKeys0.KEY_TESTPAYMENT_PAYMENT_METHODS_PRIMARY;
    public static final UniqueKey<TestpaymentPaymentMethodsRecord> KEY_TESTPAYMENT_PAYMENT_METHODS_RECORD_ID                                 = UniqueKeys0.KEY_TESTPAYMENT_PAYMENT_METHODS_RECORD_ID;
    public static final UniqueKey<TestpaymentPaymentMethodsRecord> KEY_TESTPAYMENT_PAYMENT_METHODS_TESTPAYMENT_PAYMENT_METHODS_KB_PAYMENT_ID = UniqueKeys0.KEY_TESTPAYMENT_PAYMENT_METHODS_TESTPAYMENT_PAYMENT_METHODS_KB_PAYMENT_ID;
    public static final UniqueKey<TestpaymentResponsesRecord>      KEY_TESTPAYMENT_RESPONSES_PRIMARY                                         = UniqueKeys0.KEY_TESTPAYMENT_RESPONSES_PRIMARY;
    public static final UniqueKey<TestpaymentResponsesRecord>      KEY_TESTPAYMENT_RESPONSES_RECORD_ID                                       = UniqueKeys0.KEY_TESTPAYMENT_RESPONSES_RECORD_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<TestpaymentHppRequestsRecord, ULong>    IDENTITY_TESTPAYMENT_HPP_REQUESTS    = createIdentity(
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS,
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.RECORD_ID);
        public static Identity<TestpaymentPaymentMethodsRecord, ULong> IDENTITY_TESTPAYMENT_PAYMENT_METHODS = createIdentity(
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS,
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS.RECORD_ID);
        public static Identity<TestpaymentResponsesRecord, ULong>      IDENTITY_TESTPAYMENT_RESPONSES       = createIdentity(
                TestpaymentResponses.TESTPAYMENT_RESPONSES,
                TestpaymentResponses.TESTPAYMENT_RESPONSES.RECORD_ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<TestpaymentHppRequestsRecord>    KEY_TESTPAYMENT_HPP_REQUESTS_PRIMARY                                      = createUniqueKey(
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS,
                "KEY_testpayment_hpp_requests_PRIMARY",
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.RECORD_ID);
        public static final UniqueKey<TestpaymentHppRequestsRecord>    KEY_TESTPAYMENT_HPP_REQUESTS_RECORD_ID                                    = createUniqueKey(
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS,
                "KEY_testpayment_hpp_requests_record_id",
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.RECORD_ID);
        public static final UniqueKey<TestpaymentHppRequestsRecord>    KEY_TESTPAYMENT_HPP_REQUESTS_TESTPAYMENT_HPP_REQUESTS_KB_SESSION_ID       = createUniqueKey(
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS,
                "KEY_testpayment_hpp_requests_testpayment_hpp_requests_kb_session_id",
                TestpaymentHppRequests.TESTPAYMENT_HPP_REQUESTS.SESSION_ID);
        public static final UniqueKey<TestpaymentPaymentMethodsRecord> KEY_TESTPAYMENT_PAYMENT_METHODS_PRIMARY                                   = createUniqueKey(
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS,
                "KEY_testpayment_payment_methods_PRIMARY",
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS.RECORD_ID);
        public static final UniqueKey<TestpaymentPaymentMethodsRecord> KEY_TESTPAYMENT_PAYMENT_METHODS_RECORD_ID                                 = createUniqueKey(
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS,
                "KEY_testpayment_payment_methods_record_id",
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS.RECORD_ID);
        public static final UniqueKey<TestpaymentPaymentMethodsRecord> KEY_TESTPAYMENT_PAYMENT_METHODS_TESTPAYMENT_PAYMENT_METHODS_KB_PAYMENT_ID = createUniqueKey(
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS,
                "KEY_testpayment_payment_methods_testpayment_payment_methods_kb_payment_id",
                TestpaymentPaymentMethods.TESTPAYMENT_PAYMENT_METHODS.KB_PAYMENT_METHOD_ID);
        public static final UniqueKey<TestpaymentResponsesRecord>      KEY_TESTPAYMENT_RESPONSES_PRIMARY                                         = createUniqueKey(
                TestpaymentResponses.TESTPAYMENT_RESPONSES,
                "KEY_testpayment_responses_PRIMARY",
                TestpaymentResponses.TESTPAYMENT_RESPONSES.RECORD_ID);
        public static final UniqueKey<TestpaymentResponsesRecord>      KEY_TESTPAYMENT_RESPONSES_RECORD_ID                                       = createUniqueKey(
                TestpaymentResponses.TESTPAYMENT_RESPONSES,
                "KEY_testpayment_responses_record_id",
                TestpaymentResponses.TESTPAYMENT_RESPONSES.RECORD_ID);
    }
}
