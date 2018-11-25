package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.HTML;
import org.kyojo.schemaorg.m3n4.core.Clazz;

@ExternalDomain
public class HTMLConverter implements DomainConverter<Clazz.HTML, String> {

	@Override
	public String fromDomainToValue(Clazz.HTML domain) {
		return domain.getNativeValue();
	}

	@Override
	public Clazz.HTML fromValueToDomain(String value) {
		return new HTML(value);
	}

}
