package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ABOUT;
import org.kyojo.schemaOrg.m3n3.core.Container.About;

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
