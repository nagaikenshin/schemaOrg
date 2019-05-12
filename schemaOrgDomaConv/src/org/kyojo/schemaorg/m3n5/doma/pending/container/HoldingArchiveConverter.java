package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.HOLDING_ARCHIVE;
import org.kyojo.schemaorg.m3n5.pending.Container.HoldingArchive;

@ExternalDomain
public class HoldingArchiveConverter implements DomainConverter<HoldingArchive, String> {

	@Override
	public String fromDomainToValue(HoldingArchive domain) {
		return domain.getNativeValue();
	}

	@Override
	public HoldingArchive fromValueToDomain(String value) {
		return new HOLDING_ARCHIVE(value);
	}

}
