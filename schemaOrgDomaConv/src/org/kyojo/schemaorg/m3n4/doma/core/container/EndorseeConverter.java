package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ENDORSEE;
import org.kyojo.schemaorg.m3n4.core.Container.Endorsee;

@ExternalDomain
public class EndorseeConverter implements DomainConverter<Endorsee, String> {

	@Override
	public String fromDomainToValue(Endorsee domain) {
		return domain.getNativeValue();
	}

	@Override
	public Endorsee fromValueToDomain(String value) {
		return new ENDORSEE(value);
	}

}