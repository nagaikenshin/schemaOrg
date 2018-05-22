package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TITLE;
import org.kyojo.schemaOrg.m3n3.core.Container.Title;

@ExternalDomain
public class TitleConverter implements DomainConverter<Title, String> {

	@Override
	public String fromDomainToValue(Title domain) {
		return domain.getNativeValue();
	}

	@Override
	public Title fromValueToDomain(String value) {
		return new TITLE(value);
	}

}
