package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ADDITIONAL_VARIABLE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.AdditionalVariable;

@ExternalDomain
public class AdditionalVariableConverter implements DomainConverter<AdditionalVariable, String> {

	@Override
	public String fromDomainToValue(AdditionalVariable domain) {
		return domain.getNativeValue();
	}

	@Override
	public AdditionalVariable fromValueToDomain(String value) {
		return new ADDITIONAL_VARIABLE(value);
	}

}
