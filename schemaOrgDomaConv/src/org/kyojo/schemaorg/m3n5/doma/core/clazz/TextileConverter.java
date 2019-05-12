package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TEXTILE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Textile;

@ExternalDomain
public class TextileConverter implements DomainConverter<Textile, String> {

	@Override
	public String fromDomainToValue(Textile domain) {
		return domain.getNativeValue();
	}

	@Override
	public Textile fromValueToDomain(String value) {
		return new TEXTILE(value);
	}

}
