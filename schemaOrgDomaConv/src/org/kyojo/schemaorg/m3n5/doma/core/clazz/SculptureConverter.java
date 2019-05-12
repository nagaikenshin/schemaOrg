package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SCULPTURE;
import org.kyojo.schemaorg.m3n5.core.Clazz.Sculpture;

@ExternalDomain
public class SculptureConverter implements DomainConverter<Sculpture, String> {

	@Override
	public String fromDomainToValue(Sculpture domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sculpture fromValueToDomain(String value) {
		return new SCULPTURE(value);
	}

}
