package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ADDITIONAL_VARIABLE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.AdditionalVariable;

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
