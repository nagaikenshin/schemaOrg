package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAINTING;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Painting;

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
