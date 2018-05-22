package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PREDECESSOR_OF;
import org.kyojo.schemaOrg.m3n3.core.Container.PredecessorOf;

@ExternalDomain
public class PredecessorOfConverter implements DomainConverter<PredecessorOf, String> {

	@Override
	public String fromDomainToValue(PredecessorOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public PredecessorOf fromValueToDomain(String value) {
		return new PREDECESSOR_OF(value);
	}

}
