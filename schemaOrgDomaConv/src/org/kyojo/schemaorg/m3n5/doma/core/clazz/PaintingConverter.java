package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PAINTING;
import org.kyojo.schemaorg.m3n5.core.Clazz.Painting;

@ExternalDomain
public class PaintingConverter implements DomainConverter<Painting, String> {

	@Override
	public String fromDomainToValue(Painting domain) {
		return domain.getNativeValue();
	}

	@Override
	public Painting fromValueToDomain(String value) {
		return new PAINTING(value);
	}

}
