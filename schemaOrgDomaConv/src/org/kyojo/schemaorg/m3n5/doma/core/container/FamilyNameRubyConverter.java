package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FAMILY_NAME_RUBY;
import org.kyojo.schemaorg.m3n5.core.Container.FamilyNameRuby;

@ExternalDomain
public class FamilyNameRubyConverter implements DomainConverter<FamilyNameRuby, String> {

	@Override
	public String fromDomainToValue(FamilyNameRuby domain) {
		return domain.getNativeValue();
	}

	@Override
	public FamilyNameRuby fromValueToDomain(String value) {
		return new FAMILY_NAME_RUBY(value);
	}

}
