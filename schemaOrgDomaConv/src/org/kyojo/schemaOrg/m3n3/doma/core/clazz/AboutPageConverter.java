package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ABOUT_PAGE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AboutPage;

@ExternalDomain
public class AboutPageConverter implements DomainConverter<AboutPage, String> {

	@Override
	public String fromDomainToValue(AboutPage domain) {
		return domain.getNativeValue();
	}

	@Override
	public AboutPage fromValueToDomain(String value) {
		return new ABOUT_PAGE(value);
	}

}
