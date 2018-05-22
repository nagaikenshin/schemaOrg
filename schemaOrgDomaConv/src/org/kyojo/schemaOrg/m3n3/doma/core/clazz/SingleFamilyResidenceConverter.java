package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SINGLE_FAMILY_RESIDENCE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.SingleFamilyResidence;

@ExternalDomain
public class SingleFamilyResidenceConverter implements DomainConverter<SingleFamilyResidence, String> {

	@Override
	public String fromDomainToValue(SingleFamilyResidence domain) {
		return domain.getNativeValue();
	}

	@Override
	public SingleFamilyResidence fromValueToDomain(String value) {
		return new SINGLE_FAMILY_RESIDENCE(value);
	}

}
