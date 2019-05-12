package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.NAME_RUBY;
import org.kyojo.schemaorg.m3n5.core.Container.NameRuby;

@ExternalDomain
public class NameRubyConverter implements DomainConverter<NameRuby, String> {

	@Override
	public String fromDomainToValue(NameRuby domain) {
		return domain.getNativeValue();
	}

	@Override
	public NameRuby fromValueToDomain(String value) {
		return new NAME_RUBY(value);
	}

}
