package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.REPLACEE;
import org.kyojo.schemaorg.m3n4.core.Container.Replacee;

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
