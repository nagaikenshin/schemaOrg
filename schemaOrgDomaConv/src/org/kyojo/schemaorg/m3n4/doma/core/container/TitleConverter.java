package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TITLE;
import org.kyojo.schemaorg.m3n4.core.Container.Title;

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
