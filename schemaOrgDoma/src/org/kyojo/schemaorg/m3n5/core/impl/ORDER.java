package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.AcceptedOffer;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.BillingAddress;
import org.kyojo.schemaorg.m3n5.core.Container.Broker;
import org.kyojo.schemaorg.m3n5.core.Container.ConfirmationNumber;
import org.kyojo.schemaorg.m3n5.core.Container.Customer;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.Discount;
import org.kyojo.schemaorg.m3n5.core.Container.DiscountCode;
import org.kyojo.schemaorg.m3n5.core.Container.DiscountCurrency;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.IsGift;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.OrderDate;
import org.kyojo.schemaorg.m3n5.core.Container.OrderDelivery;
import org.kyojo.schemaorg.m3n5.core.Container.OrderNumber;
import org.kyojo.schemaorg.m3n5.core.Container.OrderStatus;
import org.kyojo.schemaorg.m3n5.core.Container.OrderedItem;
import org.kyojo.schemaorg.m3n5.core.Container.PartOfInvoice;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentDueDate;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentMethod;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentMethodId;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentUrl;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.Seller;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;


public class ORDER implements Clazz.Order {

	private static final long serialVersionUID = 1L;

	public Long seq;
	public Long refSeq;
	public String refAcr;
	public java.util.Date createdAt;
	public Long createdBy;
	public java.util.Date updatedAt;
	public Long updatedBy;
	public java.util.Date expiredAt;
	public Long expiredBy;
	public AcceptedOffer acceptedOffer;
	public AdditionalType additionalType;
	public AlternateName alternateName;
	public BillingAddress billingAddress;
	public Broker broker;
	public ConfirmationNumber confirmationNumber;
	public Customer customer;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Discount discount;
	public DiscountCode discountCode;
	public DiscountCurrency discountCurrency;
	public Identifier identifier;
	public Image image;
	public IsGift isGift;
	public MainEntityOfPage mainEntityOfPage;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public OrderDate orderDate;
	public OrderDelivery orderDelivery;
	public OrderNumber orderNumber;
	public OrderStatus orderStatus;
	public OrderedItem orderedItem;
	public PartOfInvoice partOfInvoice;
	public PaymentDueDate paymentDueDate;
	public PaymentMethod paymentMethod;
	public PaymentMethodId paymentMethodId;
	public PaymentUrl paymentUrl;
	public PotentialAction potentialAction;
	public SameAs sameAs;
	public Seller seller;
	public SubjectOf subjectOf;
	public Url url;

	public ORDER() {
	}

	public ORDER(Long seq) {
		setSeq(seq);
	}

	public ORDER(String string) {
		setName(new NAME(new TEXT(string)));
	}

	@Override
	public String getString() {
		if(name == null) return null;

		List<DataType.Text> textList = name.getTextList();
		if(textList == null || textList.size() == 0 || textList.get(0) == null) {
			return null;
		} else {
			return textList.get(0).getString();
		}
	}

	@Override
	public void setString(String string) {
		if(name == null) name = new NAME();

		List<DataType.Text> textList = name.getTextList();
		if(textList == null) {
			textList = new ArrayList<DataType.Text>();
			name.setTextList(textList);
		}
		if(textList.size() == 0) {
			textList.add(new TEXT(string));
		} else {
			textList.set(0, new TEXT(string));
		}
	}

	public ORDER(AcceptedOffer acceptedOffer) {
		setAcceptedOffer(acceptedOffer);
	}

	@Override
	public AcceptedOffer getAcceptedOffer() {
		return acceptedOffer;
	}

	@Override
	public void setAcceptedOffer(AcceptedOffer acceptedOffer) {
		this.acceptedOffer = acceptedOffer;
	}

	public ORDER(AdditionalType additionalType) {
		setAdditionalType(additionalType);
	}

	@Override
	public AdditionalType getAdditionalType() {
		return additionalType;
	}

	@Override
	public void setAdditionalType(AdditionalType additionalType) {
		this.additionalType = additionalType;
	}

	public ORDER(AlternateName alternateName) {
		setAlternateName(alternateName);
	}

	@Override
	public AlternateName getAlternateName() {
		return alternateName;
	}

	@Override
	public void setAlternateName(AlternateName alternateName) {
		this.alternateName = alternateName;
	}

	public ORDER(BillingAddress billingAddress) {
		setBillingAddress(billingAddress);
	}

	@Override
	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	@Override
	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public ORDER(Broker broker) {
		setBroker(broker);
	}

	@Override
	public Broker getBroker() {
		return broker;
	}

	@Override
	public void setBroker(Broker broker) {
		this.broker = broker;
	}

	public ORDER(ConfirmationNumber confirmationNumber) {
		setConfirmationNumber(confirmationNumber);
	}

	@Override
	public ConfirmationNumber getConfirmationNumber() {
		return confirmationNumber;
	}

	@Override
	public void setConfirmationNumber(ConfirmationNumber confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public ORDER(Customer customer) {
		setCustomer(customer);
	}

	@Override
	public Customer getCustomer() {
		return customer;
	}

	@Override
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ORDER(Description description) {
		setDescription(description);
	}

	@Override
	public Description getDescription() {
		return description;
	}

	@Override
	public void setDescription(Description description) {
		this.description = description;
	}

	public ORDER(DisambiguatingDescription disambiguatingDescription) {
		setDisambiguatingDescription(disambiguatingDescription);
	}

	@Override
	public DisambiguatingDescription getDisambiguatingDescription() {
		return disambiguatingDescription;
	}

	@Override
	public void setDisambiguatingDescription(DisambiguatingDescription disambiguatingDescription) {
		this.disambiguatingDescription = disambiguatingDescription;
	}

	public ORDER(Discount discount) {
		setDiscount(discount);
	}

	@Override
	public Discount getDiscount() {
		return discount;
	}

	@Override
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public ORDER(DiscountCode discountCode) {
		setDiscountCode(discountCode);
	}

	@Override
	public DiscountCode getDiscountCode() {
		return discountCode;
	}

	@Override
	public void setDiscountCode(DiscountCode discountCode) {
		this.discountCode = discountCode;
	}

	public ORDER(DiscountCurrency discountCurrency) {
		setDiscountCurrency(discountCurrency);
	}

	@Override
	public DiscountCurrency getDiscountCurrency() {
		return discountCurrency;
	}

	@Override
	public void setDiscountCurrency(DiscountCurrency discountCurrency) {
		this.discountCurrency = discountCurrency;
	}

	public ORDER(Identifier identifier) {
		setIdentifier(identifier);
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	@Override
	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	public ORDER(Image image) {
		setImage(image);
	}

	@Override
	public Image getImage() {
		return image;
	}

	@Override
	public void setImage(Image image) {
		this.image = image;
	}

	public ORDER(IsGift isGift) {
		setIsGift(isGift);
	}

	@Override
	public IsGift getIsGift() {
		return isGift;
	}

	@Override
	public void setIsGift(IsGift isGift) {
		this.isGift = isGift;
	}

	public ORDER(MainEntityOfPage mainEntityOfPage) {
		setMainEntityOfPage(mainEntityOfPage);
	}

	@Override
	public MainEntityOfPage getMainEntityOfPage() {
		return mainEntityOfPage;
	}

	@Override
	public void setMainEntityOfPage(MainEntityOfPage mainEntityOfPage) {
		this.mainEntityOfPage = mainEntityOfPage;
	}

	public ORDER(Name name) {
		setName(name);
	}

	@Override
	public Name getName() {
		return name;
	}

	@Override
	public void setName(Name name) {
		this.name = name;
	}

	public ORDER(NameFuzzy nameFuzzy) {
		setNameFuzzy(nameFuzzy);
	}

	@Override
	public NameFuzzy getNameFuzzy() {
		return nameFuzzy;
	}

	@Override
	public void setNameFuzzy(NameFuzzy nameFuzzy) {
		this.nameFuzzy = nameFuzzy;
	}

	public ORDER(NameRuby nameRuby) {
		setNameRuby(nameRuby);
	}

	@Override
	public NameRuby getNameRuby() {
		return nameRuby;
	}

	@Override
	public void setNameRuby(NameRuby nameRuby) {
		this.nameRuby = nameRuby;
	}

	public ORDER(OrderDate orderDate) {
		setOrderDate(orderDate);
	}

	@Override
	public OrderDate getOrderDate() {
		return orderDate;
	}

	@Override
	public void setOrderDate(OrderDate orderDate) {
		this.orderDate = orderDate;
	}

	public ORDER(OrderDelivery orderDelivery) {
		setOrderDelivery(orderDelivery);
	}

	@Override
	public OrderDelivery getOrderDelivery() {
		return orderDelivery;
	}

	@Override
	public void setOrderDelivery(OrderDelivery orderDelivery) {
		this.orderDelivery = orderDelivery;
	}

	public ORDER(OrderNumber orderNumber) {
		setOrderNumber(orderNumber);
	}

	@Override
	public OrderNumber getOrderNumber() {
		return orderNumber;
	}

	@Override
	public void setOrderNumber(OrderNumber orderNumber) {
		this.orderNumber = orderNumber;
	}

	public ORDER(OrderStatus orderStatus) {
		setOrderStatus(orderStatus);
	}

	@Override
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	@Override
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	public ORDER(OrderedItem orderedItem) {
		setOrderedItem(orderedItem);
	}

	@Override
	public OrderedItem getOrderedItem() {
		return orderedItem;
	}

	@Override
	public void setOrderedItem(OrderedItem orderedItem) {
		this.orderedItem = orderedItem;
	}

	public ORDER(PartOfInvoice partOfInvoice) {
		setPartOfInvoice(partOfInvoice);
	}

	@Override
	public PartOfInvoice getPartOfInvoice() {
		return partOfInvoice;
	}

	@Override
	public void setPartOfInvoice(PartOfInvoice partOfInvoice) {
		this.partOfInvoice = partOfInvoice;
	}

	public ORDER(PaymentDueDate paymentDueDate) {
		setPaymentDueDate(paymentDueDate);
	}

	@Override
	public PaymentDueDate getPaymentDueDate() {
		return paymentDueDate;
	}

	@Override
	public void setPaymentDueDate(PaymentDueDate paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}

	public ORDER(PaymentMethod paymentMethod) {
		setPaymentMethod(paymentMethod);
	}

	@Override
	public PaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	@Override
	public void setPaymentMethod(PaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public ORDER(PaymentMethodId paymentMethodId) {
		setPaymentMethodId(paymentMethodId);
	}

	@Override
	public PaymentMethodId getPaymentMethodId() {
		return paymentMethodId;
	}

	@Override
	public void setPaymentMethodId(PaymentMethodId paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}

	public ORDER(PaymentUrl paymentUrl) {
		setPaymentUrl(paymentUrl);
	}

	@Override
	public PaymentUrl getPaymentUrl() {
		return paymentUrl;
	}

	@Override
	public void setPaymentUrl(PaymentUrl paymentUrl) {
		this.paymentUrl = paymentUrl;
	}

	public ORDER(PotentialAction potentialAction) {
		setPotentialAction(potentialAction);
	}

	@Override
	public PotentialAction getPotentialAction() {
		return potentialAction;
	}

	@Override
	public void setPotentialAction(PotentialAction potentialAction) {
		this.potentialAction = potentialAction;
	}

	public ORDER(SameAs sameAs) {
		setSameAs(sameAs);
	}

	@Override
	public SameAs getSameAs() {
		return sameAs;
	}

	@Override
	public void setSameAs(SameAs sameAs) {
		this.sameAs = sameAs;
	}

	public ORDER(Seller seller) {
		setSeller(seller);
	}

	@Override
	public Seller getSeller() {
		return seller;
	}

	@Override
	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public ORDER(SubjectOf subjectOf) {
		setSubjectOf(subjectOf);
	}

	@Override
	public SubjectOf getSubjectOf() {
		return subjectOf;
	}

	@Override
	public void setSubjectOf(SubjectOf subjectOf) {
		this.subjectOf = subjectOf;
	}

	public ORDER(Url url) {
		setUrl(url);
	}

	@Override
	public Url getUrl() {
		return url;
	}

	@Override
	public void setUrl(Url url) {
		this.url = url;
	}

	public void copy(Clazz.Order org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAcceptedOffer(org.getAcceptedOffer());
		setAdditionalType(org.getAdditionalType());
		setAlternateName(org.getAlternateName());
		setBillingAddress(org.getBillingAddress());
		setBroker(org.getBroker());
		setConfirmationNumber(org.getConfirmationNumber());
		setCustomer(org.getCustomer());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setDiscount(org.getDiscount());
		setDiscountCode(org.getDiscountCode());
		setDiscountCurrency(org.getDiscountCurrency());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setIsGift(org.getIsGift());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setOrderDate(org.getOrderDate());
		setOrderDelivery(org.getOrderDelivery());
		setOrderNumber(org.getOrderNumber());
		setOrderStatus(org.getOrderStatus());
		setOrderedItem(org.getOrderedItem());
		setPartOfInvoice(org.getPartOfInvoice());
		setPaymentDueDate(org.getPaymentDueDate());
		setPaymentMethod(org.getPaymentMethod());
		setPaymentMethodId(org.getPaymentMethodId());
		setPaymentUrl(org.getPaymentUrl());
		setPotentialAction(org.getPotentialAction());
		setSameAs(org.getSameAs());
		setSeller(org.getSeller());
		setSubjectOf(org.getSubjectOf());
		setUrl(org.getUrl());
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public Long getSeq() {
		return seq;
	}

	@Override
	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Override
	public Long getRefSeq() {
		return refSeq;
	}

	@Override
	public void setRefSeq(Long refSeq) {
		this.refSeq = refSeq;
	}

	@Override
	public String getRefAcr() {
		return refAcr;
	}

	@Override
	public void setRefAcr(String refAcr) {
		this.refAcr = refAcr;
	}

	@Override
	public java.util.Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public void setCreatedAt(java.util.Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public Long getCreatedBy() {
		return createdBy;
	}

	@Override
	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public java.util.Date getUpdatedAt() {
		return updatedAt;
	}

	@Override
	public void setUpdatedAt(java.util.Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public Long getUpdatedBy() {
		return updatedBy;
	}

	@Override
	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Override
	public java.util.Date getExpiredAt() {
		return expiredAt;
	}

	@Override
	public void setExpiredAt(java.util.Date expiredAt) {
		this.expiredAt = expiredAt;
	}

	@Override
	public Long getExpiredBy() {
		return expiredBy;
	}

	@Override
	public void setExpiredBy(Long expiredBy) {
		this.expiredBy = expiredBy;
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
