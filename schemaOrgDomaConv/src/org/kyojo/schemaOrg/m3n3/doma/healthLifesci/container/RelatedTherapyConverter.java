package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.RELATED_THERAPY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.RelatedTherapy;

@ExternalDomain
public class RelatedTherapyConverter implements DomainConverter<RelatedTherapy, String> {

	@Override
	public String fromDomainToValue(RelatedTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public RelatedTherapy fromValueToDomain(String value) {
		return new RELATED_THERAPY(value);
	}

}
