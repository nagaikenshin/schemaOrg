package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.FUNCTIONAL_CLASS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.FunctionalClass;

@ExternalDomain
public class FunctionalClassConverter implements DomainConverter<FunctionalClass, String> {

	@Override
	public String fromDomainToValue(FunctionalClass domain) {
		return domain.getNativeValue();
	}

	@Override
	public FunctionalClass fromValueToDomain(String value) {
		return new FUNCTIONAL_CLASS(value);
	}

}
