package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz;
import org.kyojo.schemaorg.m3n5.core.Container.AccountId;
import org.kyojo.schemaorg.m3n5.core.Container.AdditionalType;
import org.kyojo.schemaorg.m3n5.core.Container.AlternateName;
import org.kyojo.schemaorg.m3n5.core.Container.BillingPeriod;
import org.kyojo.schemaorg.m3n5.core.Container.Broker;
import org.kyojo.schemaorg.m3n5.core.Container.Category;
import org.kyojo.schemaorg.m3n5.core.Container.ConfirmationNumber;
import org.kyojo.schemaorg.m3n5.core.Container.Customer;
import org.kyojo.schemaorg.m3n5.core.Container.Description;
import org.kyojo.schemaorg.m3n5.core.Container.DisambiguatingDescription;
import org.kyojo.schemaorg.m3n5.core.Container.Identifier;
import org.kyojo.schemaorg.m3n5.core.Container.Image;
import org.kyojo.schemaorg.m3n5.core.Container.MainEntityOfPage;
import org.kyojo.schemaorg.m3n5.core.Container.MinimumPaymentDue;
import org.kyojo.schemaorg.m3n5.core.Container.Name;
import org.kyojo.schemaorg.m3n5.core.Container.NameFuzzy;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentDueDate;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentMethod;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentMethodId;
import org.kyojo.schemaorg.m3n5.core.Container.PaymentStatus;
import org.kyojo.schemaorg.m3n5.core.Container.PotentialAction;
import org.kyojo.schemaorg.m3n5.core.Container.Provider;
import org.kyojo.schemaorg.m3n5.core.Container.ReferencesOrder;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;
import org.kyojo.schemaorg.m3n5.core.Container.ScheduledPaymentDate;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;
import org.kyojo.schemaorg.m3n5.core.Container.TotalPaymentDue;
import org.kyojo.schemaorg.m3n5.core.Container.Url;
import org.kyojo.schemaorg.m3n5.core.DataType;
import org.kyojo.schemaorg.m3n5.core.impl.NAME;
import org.kyojo.schemaorg.m3n5.core.impl.TEXT;


public class INVOICE implements Clazz.Invoice {

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
	public AccountId accountId;
	public AdditionalType additionalType;
	public AlternateName alternateName;
	public BillingPeriod billingPeriod;
	public Broker broker;
	public Category category;
	public ConfirmationNumber confirmationNumber;
	public Customer customer;
	public Description description;
	public DisambiguatingDescription disambiguatingDescription;
	public Identifier identifier;
	public Image image;
	public MainEntityOfPage mainEntityOfPage;
	public MinimumPaymentDue minimumPaymentDue;
	public Name name;
	public NameFuzzy nameFuzzy;
	public NameRuby nameRuby;
	public PaymentDueDate paymentDueDate;
	public PaymentMethod paymentMethod;
	public PaymentMethodId paymentMethodId;
	public PaymentStatus paymentStatus;
	public PotentialAction potentialAction;
	public Provider provider;
	public ReferencesOrder referencesOrder;
	public SameAs sameAs;
	public ScheduledPaymentDate scheduledPaymentDate;
	public SubjectOf subjectOf;
	public TotalPaymentDue totalPaymentDue;
	public Url url;

	public INVOICE() {
	}

	public INVOICE(Long seq) {
		setSeq(seq);
	}

	public INVOICE(String string) {
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

	public INVOICE(AccountId accountId) {
		setAccountId(accountId);
	}

	@Override
	public AccountId getAccountId() {
		return accountId;
	}

	@Override
	public void setAccountId(AccountId accountId) {
		this.accountId = accountId;
	}

	public INVOICE(AdditionalType additionalType) {
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

	public INVOICE(AlternateName alternateName) {
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

	public INVOICE(BillingPeriod billingPeriod) {
		setBillingPeriod(billingPeriod);
	}

	@Override
	public BillingPeriod getBillingPeriod() {
		return billingPeriod;
	}

	@Override
	public void setBillingPeriod(BillingPeriod billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	public INVOICE(Broker broker) {
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

	public INVOICE(Category category) {
		setCategory(category);
	}

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public void setCategory(Category category) {
		this.category = category;
	}

	public INVOICE(ConfirmationNumber confirmationNumber) {
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

	public INVOICE(Customer customer) {
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

	public INVOICE(Description description) {
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

	public INVOICE(DisambiguatingDescription disambiguatingDescription) {
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

	public INVOICE(Identifier identifier) {
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

	public INVOICE(Image image) {
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

	public INVOICE(MainEntityOfPage mainEntityOfPage) {
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

	public INVOICE(MinimumPaymentDue minimumPaymentDue) {
		setMinimumPaymentDue(minimumPaymentDue);
	}

	@Override
	public MinimumPaymentDue getMinimumPaymentDue() {
		return minimumPaymentDue;
	}

	@Override
	public void setMinimumPaymentDue(MinimumPaymentDue minimumPaymentDue) {
		this.minimumPaymentDue = minimumPaymentDue;
	}

	public INVOICE(Name name) {
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

	public INVOICE(NameFuzzy nameFuzzy) {
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

	public INVOICE(NameRuby nameRuby) {
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

	public INVOICE(PaymentDueDate paymentDueDate) {
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

	public INVOICE(PaymentMethod paymentMethod) {
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

	public INVOICE(PaymentMethodId paymentMethodId) {
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

	public INVOICE(PaymentStatus paymentStatus) {
		setPaymentStatus(paymentStatus);
	}

	@Override
	public PaymentStatus getPaymentStatus() {
		return paymentStatus;
	}

	@Override
	public void setPaymentStatus(PaymentStatus paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public INVOICE(PotentialAction potentialAction) {
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

	public INVOICE(Provider provider) {
		setProvider(provider);
	}

	@Override
	public Provider getProvider() {
		return provider;
	}

	@Override
	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public INVOICE(ReferencesOrder referencesOrder) {
		setReferencesOrder(referencesOrder);
	}

	@Override
	public ReferencesOrder getReferencesOrder() {
		return referencesOrder;
	}

	@Override
	public void setReferencesOrder(ReferencesOrder referencesOrder) {
		this.referencesOrder = referencesOrder;
	}

	public INVOICE(SameAs sameAs) {
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

	public INVOICE(ScheduledPaymentDate scheduledPaymentDate) {
		setScheduledPaymentDate(scheduledPaymentDate);
	}

	@Override
	public ScheduledPaymentDate getScheduledPaymentDate() {
		return scheduledPaymentDate;
	}

	@Override
	public void setScheduledPaymentDate(ScheduledPaymentDate scheduledPaymentDate) {
		this.scheduledPaymentDate = scheduledPaymentDate;
	}

	public INVOICE(SubjectOf subjectOf) {
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

	public INVOICE(TotalPaymentDue totalPaymentDue) {
		setTotalPaymentDue(totalPaymentDue);
	}

	@Override
	public TotalPaymentDue getTotalPaymentDue() {
		return totalPaymentDue;
	}

	@Override
	public void setTotalPaymentDue(TotalPaymentDue totalPaymentDue) {
		this.totalPaymentDue = totalPaymentDue;
	}

	public INVOICE(Url url) {
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

	public void copy(Clazz.Invoice org) {
		setSeq(org.getSeq());
		setRefSeq(org.getRefSeq());
		setRefAcr(org.getRefAcr());
		setCreatedAt(org.getCreatedAt());
		setCreatedBy(org.getCreatedBy());
		setUpdatedAt(org.getUpdatedAt());
		setUpdatedBy(org.getUpdatedBy());
		setExpiredAt(org.getExpiredAt());
		setExpiredBy(org.getExpiredBy());
		setAccountId(org.getAccountId());
		setAdditionalType(org.getAdditionalType());
		setAlternateName(org.getAlternateName());
		setBillingPeriod(org.getBillingPeriod());
		setBroker(org.getBroker());
		setCategory(org.getCategory());
		setConfirmationNumber(org.getConfirmationNumber());
		setCustomer(org.getCustomer());
		setDescription(org.getDescription());
		setDisambiguatingDescription(org.getDisambiguatingDescription());
		setIdentifier(org.getIdentifier());
		setImage(org.getImage());
		setMainEntityOfPage(org.getMainEntityOfPage());
		setMinimumPaymentDue(org.getMinimumPaymentDue());
		setName(org.getName());
		setNameFuzzy(org.getNameFuzzy());
		setNameRuby(org.getNameRuby());
		setPaymentDueDate(org.getPaymentDueDate());
		setPaymentMethod(org.getPaymentMethod());
		setPaymentMethodId(org.getPaymentMethodId());
		setPaymentStatus(org.getPaymentStatus());
		setPotentialAction(org.getPotentialAction());
		setProvider(org.getProvider());
		setReferencesOrder(org.getReferencesOrder());
		setSameAs(org.getSameAs());
		setScheduledPaymentDate(org.getScheduledPaymentDate());
		setSubjectOf(org.getSubjectOf());
		setTotalPaymentDue(org.getTotalPaymentDue());
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
