package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/OrderStatus")
@CamelizedName("orderStatus")
@ConstantizedName("ORDER_STATUS")
public interface OrderStatus extends Clazz.OrderStatus {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderCancelled")
	@SchemaOrgLabel("OrderCancelled")
	@SchemaOrgComment(""
			+ "OrderStatus representing cancellation of an order.")
	@CamelizedName("orderCancelled")
	@ConstantizedName("ORDER_CANCELLED")
	@SampleValue("1")
	public interface OrderCancelled extends OrderStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderDelivered")
	@SchemaOrgLabel("OrderDelivered")
	@SchemaOrgComment(""
			+ "OrderStatus representing successful delivery of an order.")
	@CamelizedName("orderDelivered")
	@ConstantizedName("ORDER_DELIVERED")
	@SampleValue("2")
	public interface OrderDelivered extends OrderStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderInTransit")
	@SchemaOrgLabel("OrderInTransit")
	@SchemaOrgComment(""
			+ "OrderStatus representing that an order is in transit.")
	@CamelizedName("orderInTransit")
	@ConstantizedName("ORDER_IN_TRANSIT")
	@SampleValue("3")
	public interface OrderInTransit extends OrderStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderPaymentDue")
	@SchemaOrgLabel("OrderPaymentDue")
	@SchemaOrgComment(""
			+ "OrderStatus representing that payment is due on an order.")
	@CamelizedName("orderPaymentDue")
	@ConstantizedName("ORDER_PAYMENT_DUE")
	@SampleValue("4")
	public interface OrderPaymentDue extends OrderStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderPickupAvailable")
	@SchemaOrgLabel("OrderPickupAvailable")
	@SchemaOrgComment(""
			+ "OrderStatus representing availability of an order for pickup.")
	@CamelizedName("orderPickupAvailable")
	@ConstantizedName("ORDER_PICKUP_AVAILABLE")
	@SampleValue("5")
	public interface OrderPickupAvailable extends OrderStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderProblem")
	@SchemaOrgLabel("OrderProblem")
	@SchemaOrgComment(""
			+ "OrderStatus representing that there is a problem with the order.")
	@CamelizedName("orderProblem")
	@ConstantizedName("ORDER_PROBLEM")
	@SampleValue("6")
	public interface OrderProblem extends OrderStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderProcessing")
	@SchemaOrgLabel("OrderProcessing")
	@SchemaOrgComment(""
			+ "OrderStatus representing that an order is being processed.")
	@CamelizedName("orderProcessing")
	@ConstantizedName("ORDER_PROCESSING")
	@SampleValue("7")
	public interface OrderProcessing extends OrderStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OrderReturned")
	@SchemaOrgLabel("OrderReturned")
	@SchemaOrgComment(""
			+ "OrderStatus representing that an order has been returned.")
	@CamelizedName("orderReturned")
	@ConstantizedName("ORDER_RETURNED")
	@SampleValue("8")
	public interface OrderReturned extends OrderStatus {

	}

}
