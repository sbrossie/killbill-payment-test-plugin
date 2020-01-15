/*
 * This file is generated by jOOQ.
 */
package org.killbill.billing.plugin.paymenttest.dao.gen.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;
import org.jooq.types.ULong;
import org.killbill.billing.plugin.paymenttest.dao.gen.Keys;
import org.killbill.billing.plugin.paymenttest.dao.gen.Killbill;
import org.killbill.billing.plugin.paymenttest.dao.gen.tables.records.TestpaymentResponsesRecord;


/**
 * This class is generated by jOOQ.
 */
@Generated(
        value = {
                "http://www.jooq.org",
                "jOOQ version:3.9.1"
        },
        comments = "This class is generated by jOOQ"
)
@SuppressWarnings({"all", "unchecked", "rawtypes"})
public class TestpaymentResponses extends TableImpl<TestpaymentResponsesRecord> {

    private static final long serialVersionUID = -1851407420;

    /**
     * The reference instance of <code>killbill.testpayment_responses</code>
     */
    public static final TestpaymentResponses TESTPAYMENT_RESPONSES = new TestpaymentResponses();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TestpaymentResponsesRecord> getRecordType() {
        return TestpaymentResponsesRecord.class;
    }

    /**
     * The column <code>killbill.testpayment_responses.record_id</code>.
     */
    public final TableField<TestpaymentResponsesRecord, ULong> RECORD_ID = createField("record_id",
                                                                                       org.jooq.impl.SQLDataType.BIGINTUNSIGNED
                                                                                               .nullable(false),
                                                                                       this,
                                                                                       "");

    /**
     * The column <code>killbill.testpayment_responses.kb_account_id</code>.
     */
    public final TableField<TestpaymentResponsesRecord, String> KB_ACCOUNT_ID = createField("kb_account_id",
                                                                                            org.jooq.impl.SQLDataType.CHAR
                                                                                                    .length(36)
                                                                                                    .nullable(false),
                                                                                            this,
                                                                                            "");

    /**
     * The column <code>killbill.testpayment_responses.kb_payment_id</code>.
     */
    public final TableField<TestpaymentResponsesRecord, String> KB_PAYMENT_ID = createField("kb_payment_id",
                                                                                            org.jooq.impl.SQLDataType.CHAR
                                                                                                    .length(36)
                                                                                                    .nullable(false),
                                                                                            this,
                                                                                            "");

    /**
     * The column <code>killbill.testpayment_responses.kb_payment_transaction_id</code>.
     */
    public final TableField<TestpaymentResponsesRecord, String> KB_PAYMENT_TRANSACTION_ID = createField(
            "kb_payment_transaction_id",
            org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false),
            this,
            "");

    /**
     * The column <code>killbill.testpayment_responses.transaction_type</code>.
     */
    public final TableField<TestpaymentResponsesRecord, String> TRANSACTION_TYPE = createField("transaction_type",
                                                                                               org.jooq.impl.SQLDataType.VARCHAR
                                                                                                       .length(32)
                                                                                                       .nullable(false),
                                                                                               this,
                                                                                               "");

    /**
     * The column <code>killbill.testpayment_responses.amount</code>.
     */
    public final TableField<TestpaymentResponsesRecord, BigDecimal> AMOUNT = createField("amount",
                                                                                         org.jooq.impl.SQLDataType.DECIMAL
                                                                                                 .precision(15, 9),
                                                                                         this,
                                                                                         "");

    /**
     * The column <code>killbill.testpayment_responses.currency</code>.
     */
    public final TableField<TestpaymentResponsesRecord, String> CURRENCY = createField("currency",
                                                                                       org.jooq.impl.SQLDataType.CHAR.length(
                                                                                               3),
                                                                                       this,
                                                                                       "");

    /**
     * The column <code>killbill.testpayment_responses.additional_data</code>.
     */
    public final TableField<TestpaymentResponsesRecord, String> ADDITIONAL_DATA = createField("additional_data",
                                                                                              org.jooq.impl.SQLDataType.CLOB,
                                                                                              this,
                                                                                              "");

    /**
     * The column <code>killbill.testpayment_responses.created_date</code>.
     */
    public final TableField<TestpaymentResponsesRecord, Timestamp> CREATED_DATE = createField("created_date",
                                                                                              org.jooq.impl.SQLDataType.TIMESTAMP
                                                                                                      .nullable(false),
                                                                                              this,
                                                                                              "");

    /**
     * The column <code>killbill.testpayment_responses.kb_tenant_id</code>.
     */
    public final TableField<TestpaymentResponsesRecord, String> KB_TENANT_ID = createField("kb_tenant_id",
                                                                                           org.jooq.impl.SQLDataType.CHAR
                                                                                                   .length(36)
                                                                                                   .nullable(false),
                                                                                           this,
                                                                                           "");

    /**
     * Create a <code>killbill.testpayment_responses</code> table reference
     */
    public TestpaymentResponses() {
        this("testpayment_responses", null);
    }

    /**
     * Create an aliased <code>killbill.testpayment_responses</code> table reference
     */
    public TestpaymentResponses(String alias) {
        this(alias, TESTPAYMENT_RESPONSES);
    }

    private TestpaymentResponses(String alias, Table<TestpaymentResponsesRecord> aliased) {
        this(alias, aliased, null);
    }

    private TestpaymentResponses(String alias, Table<TestpaymentResponsesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Killbill.KILLBILL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TestpaymentResponsesRecord, ULong> getIdentity() {
        return Keys.IDENTITY_TESTPAYMENT_RESPONSES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TestpaymentResponsesRecord> getPrimaryKey() {
        return Keys.KEY_TESTPAYMENT_RESPONSES_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TestpaymentResponsesRecord>> getKeys() {
        return Arrays.<UniqueKey<TestpaymentResponsesRecord>>asList(Keys.KEY_TESTPAYMENT_RESPONSES_PRIMARY,
                                                                    Keys.KEY_TESTPAYMENT_RESPONSES_RECORD_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TestpaymentResponses as(String alias) {
        return new TestpaymentResponses(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TestpaymentResponses rename(String name) {
        return new TestpaymentResponses(name, null);
    }
}
