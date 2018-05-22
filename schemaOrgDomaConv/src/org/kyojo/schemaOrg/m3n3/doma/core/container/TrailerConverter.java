package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRAILER;
import org.kyojo.schemaOrg.m3n3.core.Container.Trailer;

@ExternalDomain
public class TrailerConverter implements DomainConverter<Trailer, String> {

	@Override
	public String fromDomainToValue(Trailer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Trailer fromValueToDomain(String value) {
		return new TRAILER(value);
	}

}
