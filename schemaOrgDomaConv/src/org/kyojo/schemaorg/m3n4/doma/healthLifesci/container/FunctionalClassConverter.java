package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.FUNCTIONAL_CLASS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.FunctionalClass;

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