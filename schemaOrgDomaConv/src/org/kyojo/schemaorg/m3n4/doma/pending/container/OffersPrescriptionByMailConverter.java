package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.OFFERS_PRESCRIPTION_BY_MAIL;
import org.kyojo.schemaorg.m3n4.pending.Container.OffersPrescriptionByMail;

@ExternalDomain
public class OffersPrescriptionByMailConverter implements DomainConverter<OffersPrescriptionByMail, Boolean> {

	@Override
	public Boolean fromDomainToValue(OffersPrescriptionByMail domain) {
		return domain.getNativeValue();
	}

	@Override
	public OffersPrescriptionByMail fromValueToDomain(Boolean value) {
		return new OFFERS_PRESCRIPTION_BY_MAIL(value);
	}

}
