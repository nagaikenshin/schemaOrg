package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PAWN_SHOP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.PawnShop;

@ExternalDomain
public class PawnShopConverter implements DomainConverter<PawnShop, String> {

	@Override
	public String fromDomainToValue(PawnShop domain) {
		return domain.getNativeValue();
	}

	@Override
	public PawnShop fromValueToDomain(String value) {
		return new PAWN_SHOP(value);
	}

}
