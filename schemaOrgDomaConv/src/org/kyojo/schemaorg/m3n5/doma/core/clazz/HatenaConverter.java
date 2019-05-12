package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.HATENA;
import org.kyojo.schemaorg.m3n5.core.Clazz.Hatena;

@ExternalDomain
public class HatenaConverter implements DomainConverter<Hatena, String> {

	@Override
	public String fromDomainToValue(Hatena domain) {
		return domain.getNativeValue();
	}

	@Override
	public Hatena fromValueToDomain(String value) {
		return new HATENA(value);
	}

}
