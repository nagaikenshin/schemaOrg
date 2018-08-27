package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ABOUT;
import org.kyojo.schemaorg.m3n4.core.Container.About;

@ExternalDomain
public class AboutConverter implements DomainConverter<About, String> {

	@Override
	public String fromDomainToValue(About domain) {
		return domain.getNativeValue();
	}

	@Override
	public About fromValueToDomain(String value) {
		return new ABOUT(value);
	}

}
