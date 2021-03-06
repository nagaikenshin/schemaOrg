package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.INSTRUMENT;
import org.kyojo.schemaorg.m3n4.core.Container.Instrument;

@ExternalDomain
public class InstrumentConverter implements DomainConverter<Instrument, String> {

	@Override
	public String fromDomainToValue(Instrument domain) {
		return domain.getNativeValue();
	}

	@Override
	public Instrument fromValueToDomain(String value) {
		return new INSTRUMENT(value);
	}

}
