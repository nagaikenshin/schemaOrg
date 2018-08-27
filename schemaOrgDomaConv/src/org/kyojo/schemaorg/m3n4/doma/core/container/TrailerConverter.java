package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.TRAILER;
import org.kyojo.schemaorg.m3n4.core.Container.Trailer;

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
