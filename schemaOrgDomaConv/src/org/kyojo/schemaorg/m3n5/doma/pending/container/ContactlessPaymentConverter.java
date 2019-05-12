package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CONTACTLESS_PAYMENT;
import org.kyojo.schemaorg.m3n5.pending.Container.ContactlessPayment;

@ExternalDomain
public class ContactlessPaymentConverter implements DomainConverter<ContactlessPayment, Boolean> {

	@Override
	public Boolean fromDomainToValue(ContactlessPayment domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContactlessPayment fromValueToDomain(Boolean value) {
		return new CONTACTLESS_PAYMENT(value);
	}

}