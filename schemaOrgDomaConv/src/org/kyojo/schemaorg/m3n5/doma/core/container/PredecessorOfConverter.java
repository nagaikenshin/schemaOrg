package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PREDECESSOR_OF;
import org.kyojo.schemaorg.m3n5.core.Container.PredecessorOf;

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