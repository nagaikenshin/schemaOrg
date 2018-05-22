package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REPLACEE;
import org.kyojo.schemaOrg.m3n3.core.Container.Replacee;

@ExternalDomain
public class ReplaceeConverter implements DomainConverter<Replacee, String> {

	@Override
	public String fromDomainToValue(Replacee domain) {
		return domain.getNativeValue();
	}

	@Override
	public Replacee fromValueToDomain(String value) {
		return new REPLACEE(value);
	}

}
