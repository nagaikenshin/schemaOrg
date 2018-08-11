package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/PaymentStatusType")
@CamelizedName("paymentStatusType")
@ConstantizedName("PAYMENT_STATUS_TYPE")
public interface PaymentStatusType extends Clazz.PaymentStatusType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentAutomaticallyApplied")
	@SchemaOrgLabel("PaymentAutomaticallyApplied")
	@SchemaOrgComment(""
			+ "An automatic payment system is in place and will be used.")
	@CamelizedName("paymentAutomaticallyApplied")
	@ConstantizedName("PAYMENT_AUTOMATICALLY_APPLIED")
	@SampleValue("1")
	public interface PaymentAutomaticallyApplied extends PaymentStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentComplete")
	@SchemaOrgLabel("PaymentComplete")
	@SchemaOrgComment(""
			+ "The payment has been received and processed.")
	@CamelizedName("paymentComplete")
	@ConstantizedName("PAYMENT_COMPLETE")
	@SampleValue("2")
	public interface PaymentComplete extends PaymentStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentDeclined")
	@SchemaOrgLabel("PaymentDeclined")
	@SchemaOrgComment(""
			+ "The payee received the payment, but it was declined for some reason.")
	@CamelizedName("paymentDeclined")
	@ConstantizedName("PAYMENT_DECLINED")
	@SampleValue("3")
	public interface PaymentDeclined extends PaymentStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentDue")
	@SchemaOrgLabel("PaymentDue")
	@SchemaOrgComment(""
			+ "The payment is due, but still within an acceptable time to be received.")
	@CamelizedName("paymentDue")
	@ConstantizedName("PAYMENT_DUE")
	@SampleValue("4")
	public interface PaymentDue extends PaymentStatusType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/PaymentPastDue")
	@SchemaOrgLabel("PaymentPastDue")
	@SchemaOrgComment("The payment is due and considered late.")
	@CamelizedName("paymentPastDue")
	@ConstantizedName("PAYMENT_PAST_DUE")
	@SampleValue("5")
	public interface PaymentPastDue extends PaymentStatusType {

	}

}
