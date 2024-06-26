package com.sopt.mobile.controller;

import com.sopt.mobile.common.dto.SuccessMessage;
import com.sopt.mobile.common.dto.SuccessStatusResponse;
import com.sopt.mobile.service.ArtistMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/artists/artist-members")
@RequiredArgsConstructor
public class ArtistMemberController {

  private final ArtistMemberService artistMemberService;

  @GetMapping("")
  public ResponseEntity<SuccessStatusResponse> getSubscribedArtists(
      @RequestHeader(name = "memberId") Long memberId){

    return ResponseEntity.ok(SuccessStatusResponse.of(
        SuccessMessage.ARTIST_MEMBER_FIND_SUCCESS,
        artistMemberService.findSubscribedArtists(memberId)));
  }

  @GetMapping("{artistMemberId}")
  public ResponseEntity<SuccessStatusResponse> getArtistMemberDetail(
      @RequestHeader(name = "memberId") Long memberId,
      @PathVariable(name = "artistMemberId") Long artistMemberId){

    return ResponseEntity.ok(SuccessStatusResponse.of(
        SuccessMessage.ARTIST_MEMBER_DETAIL_FIND_SUCCESS,
        artistMemberService.findArtistMemberDetail(memberId, artistMemberId)));
  }

}
