package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SUGGESTED_GENDER;
import org.kyojo.schemaOrg.m3n3.core.Container.SuggestedGender;

@ExternalDomain
public class SuggestedGenderConverter implements DomainConverter<SuggestedGender, String> {

	@Override
	public String fromDomainToValue(SuggestedGender domain) {
		return domain.getNativeValue();
	}

	@Override
	public SuggestedGender fromValueToDomain(String value) {
		return new SUGGESTED_GENDER(value);
	}

}
