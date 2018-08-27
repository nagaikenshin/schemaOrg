package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SINGLE_FAMILY_RESIDENCE;
import org.kyojo.schemaorg.m3n4.core.Clazz.SingleFamilyResidence;

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
