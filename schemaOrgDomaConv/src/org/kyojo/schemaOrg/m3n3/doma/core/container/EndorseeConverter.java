package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ENDORSEE;
import org.kyojo.schemaOrg.m3n3.core.Container.Endorsee;

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
