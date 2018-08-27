package org.kyojo.schemaorg.m3n4.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.APPROVED_INDICATION;
import org.kyojo.schemaorg.m3n4.healthLifesci.Clazz.ApprovedIndication;

@ExternalDomain
public class ApprovedIndicationConverter implements DomainConverter<ApprovedIndication, String> {

	@Override
	public String fromDomainToValue(ApprovedIndication domain) {
		return domain.getNativeValue();
	}

	@Override
	public ApprovedIndication fromValueToDomain(String value) {
		return new APPROVED_INDICATION(value);
	}

}
